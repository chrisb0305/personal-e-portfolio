(() => {
  const storageKey = 'siteTheme';
  const root = document.documentElement;

  const getSavedTheme = () => {
    try {
      return localStorage.getItem(storageKey);
    } catch {
      return null;
    }
  };

  const saveTheme = (theme) => {
    try {
      localStorage.setItem(storageKey, theme);
    } catch {
      // Ignore storage errors in private browsing modes.
    }
  };

  const getPreferredTheme = () => {
    const saved = getSavedTheme();
    if (saved === 'day' || saved === 'night') {
      return saved;
    }

    return window.matchMedia('(prefers-color-scheme: dark)').matches ? 'night' : 'day';
  };

  const updateButtons = (theme) => {
    const buttons = document.querySelectorAll('.theme-toggle');
    const isNight = theme === 'night';

    buttons.forEach((button) => {
      button.textContent = isNight ? 'Day Mode' : 'Night Mode';
      button.setAttribute('aria-pressed', String(isNight));
      button.setAttribute(
        'aria-label',
        isNight ? 'Switch to day theme' : 'Switch to night theme'
      );
    });
  };

  const applyTheme = (theme) => {
    root.setAttribute('data-theme', theme);
    saveTheme(theme);
    updateButtons(theme);
  };

  const initialTheme = getPreferredTheme();
  applyTheme(initialTheme);

  document.addEventListener('click', (event) => {
    const target = event.target;
    if (!(target instanceof Element)) {
      return;
    }

    const toggleButton = target.closest('.theme-toggle');
    if (!toggleButton) {
      return;
    }

    const currentTheme = root.getAttribute('data-theme') === 'night' ? 'night' : 'day';
    const nextTheme = currentTheme === 'night' ? 'day' : 'night';
    applyTheme(nextTheme);
  });
})();
