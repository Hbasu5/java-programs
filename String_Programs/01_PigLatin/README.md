# Harshad Number

---

# What is a PigLatin Word?

Pig Latin is a playful, spoken language game used to disguise English words, commonly by moving the initial consonant cluster to the end and adding "-ay" (e.g., "pig" becomes "igpay"). Words starting with vowels typically add "-way" or "-ay" (e.g., "eat" becomes "eatway" or "eatay"). It is often used by children as a secret code.

---

# Rules:

- If a word begins with a vowel, add "ay" at the end. (Example: eat → eatay)
- If a word begins with a consonant, move the first consonant (or consonant cluster) to the end and add "ay". (Example: pig → igpay)

---

# Logic Steps:
- Input: A word
- Check whether the first character is a vowel
- If vowel → append "ay"
- If consonant → move the first character to the end
- Append "ay"
- Output the transformed word

---

# Concepts Used:

- String methods (charAt(), substring(), length())
- Conditional Statements
- Character comparison
- Basic string manipulation

---

# How to Run:

- Compile the program (javac pig_latin.java)
- Run it (java pig_latin)

---

© 2026 Hardik Basu