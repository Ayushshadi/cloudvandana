document.addEventListener('DOMContentLoaded', function() {
    const surveyForm = document.getElementById('surveyForm');
    const popup = document.getElementById('popup');
    const closePopup = document.getElementById('closePopup');
    const submittedData = document.getElementById('submittedData');

    surveyForm.addEventListener('submit', function(event) {
        event.preventDefault();
        openPopup();
        displayFormData();
    });

    document.getElementById('resetButton').addEventListener('click', function() {
        surveyForm.reset();
    });

    closePopup.addEventListener('click', function() {
        closePopup.style.display = 'none';
        surveyForm.reset();
    });

    function openPopup() {
        popup.style.display = 'block';
    }

    function displayFormData() {
        submittedData.innerHTML = '';
        const formData = new FormData(surveyForm);
        for (const [key, value] of formData.entries()) {
            const label = surveyForm.querySelector(`[for="${key}"]`).textContent;
            submittedData.innerHTML += `<p><strong>${label}:</strong> ${value}</p>`;
        }
    }
});
