// Function to reverse every word in a sentence
function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Function to sort an array in descending order
function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

// Input sentence
const inputSentence = "This is a sunny day";

// Reverse every word in the sentence
const reversedSentence = reverseWordsInSentence(inputSentence);

console.log("Reversed Sentence:", reversedSentence);

// Input array
const inputArray = [4, 7, 1, 9, 3, 6, 2, 8];

// Sort the array in descending order
const sortedArray = sortArrayDescending(inputArray);

console.log("Sorted Array in Descending Order:", sortedArray);
