class Solution:
    def generateString(self, str1: str, str2: str) -> str:
        n, m = len(str1), len(str2)
        total = n + m - 1
        
        # word[i] = character, fixed[i] = True if locked by a 'T' placement
        word = ['a'] * total
        fixed = [False] * total
        
        # Step 1: Place str2 at every 'T' index, check conflicts
        for i in range(n):
            if str1[i] == 'T':
                for j in range(m):
                    pos = i + j
                    if fixed[pos] and word[pos] != str2[j]:
                        return ""  # Conflict between two 'T' placements
                    word[pos] = str2[j]
                    fixed[pos] = True
        
        # Step 2: For each 'F' index, check if current window == str2
        # If yes, we must break it — change last char of window if not fixed
        for i in range(n):
            if str1[i] == 'F':
                # Check if word[i..i+m-1] == str2
                match = all(word[i + j] == str2[j] for j in range(m))
                if match:
                    # Try to break by changing the last position (greedy: rightmost = least disruption)
                    broken = False
                    for j in range(m - 1, -1, -1):
                        pos = i + j
                        if not fixed[pos]:
                            # Set to smallest char that breaks equality
                            if str2[j] == 'a':
                                word[pos] = 'b'
                            else:
                                word[pos] = 'a'
                            broken = True
                            break
                    if not broken:
                        return ""  # All positions fixed by 'T', can't break
        
        # Step 3: Final validation — verify all 'F' positions are not equal to str2
        for i in range(n):
            if str1[i] == 'F':
                if all(word[i + j] == str2[j] for j in range(m)):
                    return ""
        
        return ''.join(word)