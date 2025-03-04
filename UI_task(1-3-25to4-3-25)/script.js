// script.js

// Countdown Timer
const countdown = () => {
  const eventDate = new Date("2025-03-10T09:00:00").getTime();
  const timer = setInterval(() => {
      const now = new Date().getTime();
      const distance = eventDate - now;

      const days = Math.floor(distance / (1000 * 60 * 60 * 24));
      const hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
      const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
      const seconds = Math.floor((distance % (1000 * 60)) / 1000);

      document.getElementById("countdown").innerHTML = `${days}d ${hours}h ${minutes}m ${seconds}s`;

      if (distance < 0) {
          clearInterval(timer);
          document.getElementById("countdown").innerHTML = "Event Started";
      }
  }, 1000);
};

// Fetch Speaker Data
document.addEventListener("DOMContentLoaded", () => {
  fetch("data/speakers.json")
      .then(response => response.json())
      .then(speakers => {
          const speakerGrid = document.querySelector(".speaker-grid");
          speakerGrid.innerHTML = ""; // Clear static content

          speakers.forEach(speaker => {
              const speakerCard = `
                  <div class="speaker-card">
                      <img src="${speaker.image}" alt="${speaker.name}">
                      <h3>${speaker.name}</h3>
                      <p>${speaker.role}</p>
                      <p>Topic: ${speaker.topic}</p>
                  </div>
              `;
              speakerGrid.innerHTML += speakerCard;
          });
      })
      .catch(error => console.error("Failed to load speaker data:", error));
});


// Form Validation
const validateForm = () => {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const message = document.getElementById("message").value;
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  if (!name || !email || !message) {
      alert("All fields are required");
      return false;
  }

  if (!emailRegex.test(email)) {
      alert("Invalid Email Address");
      return false;
  }

  alert("Form submitted successfully!");
  return true;
};

// Event Listeners
window.onload = () => {
  countdown();
  loadSpeakers();
  document.getElementById("contact-form").onsubmit = validateForm;
};
