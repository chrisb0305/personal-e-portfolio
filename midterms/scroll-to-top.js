(() => {
  const scrollTopBtn = document.querySelector('.scroll-top-btn');
  
  if (!scrollTopBtn) {
    return;
  }
  
  // Show/hide button based on scroll position
  const toggleScrollTopBtn = () => {
    // Show button when user scrolls down 300px or more
    if (window.scrollY > 300) {
      scrollTopBtn.classList.add('visible');
    } else {
      scrollTopBtn.classList.remove('visible');
    }
  };
  
  // Smooth scroll to top when button is clicked
  scrollTopBtn.addEventListener('click', () => {
    window.scrollTo({
      top: 0,
      behavior: 'smooth'
    });
  });
  
  // Listen for scroll events
  window.addEventListener('scroll', toggleScrollTopBtn, { passive: true });
  
  // Check initial scroll position on page load
  toggleScrollTopBtn();
})();
