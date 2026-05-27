class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_s = "".join(ch.lower() for ch in s if ch.isalnum())

        return clean_s == clean_s[::-1]