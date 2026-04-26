(() => {
  const instantHashKey = 'instantHashNav';

  const returnLinks = Array.from(document.querySelectorAll('.return-link[href*="#"]'));
  returnLinks.forEach((link) => {
    link.addEventListener('click', () => {
      sessionStorage.setItem(instantHashKey, '1');
    });
  });

  const reducedMotion = window.matchMedia('(prefers-reduced-motion: reduce)').matches;
  const targets = Array.from(document.querySelectorAll('.scroll-pop'));

  if (!targets.length) {
    return;
  }

  if (reducedMotion) {
    targets.forEach((target) => target.classList.add('is-visible'));
    return;
  }

  const observer = new IntersectionObserver(
    (entries, currentObserver) => {
      entries.forEach((entry) => {
        if (entry.isIntersecting) {
          entry.target.classList.add('is-visible');
          currentObserver.unobserve(entry.target);
        }
      });
    },
    { rootMargin: '0px 0px -14% 0px', threshold: 0.01 }
  );

  targets.forEach((target) => observer.observe(target));
})();
