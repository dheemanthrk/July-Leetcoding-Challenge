class Solution:
    def addDigits(self, num):
        return 0 if num == 0 else (num - 1) % 9 + 1