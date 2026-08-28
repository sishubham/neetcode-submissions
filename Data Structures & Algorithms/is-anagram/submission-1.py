class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mapS, mapT = {},{}
        for c in s:
            if c not in mapS:
                mapS[c] = 0
            else:
                mapS[c] += 1

        for c in t:
            if c not in mapT:
                mapT[c] = 0
            else:
                mapT[c] += 1
        
        return mapS == mapT
        