class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        return self.soulition3(n)
    
    # 문자열을 2진수 형태로 바꾼 후 직접 비교
    def soulition1(self, n: int) -> bool:
        bits = '{:b}'.format(n)
        for i, bit in enumerate(bits):
            print(i, bit)
            if i == len(bits) - 1:
                break
                
            if bits[i] == bits[i + 1]:
                return False
        
        return True
    
    # 비트 쉬프팅을 통해 첫 번째 비트만 비교
    def soulition2(self, n: int) -> bool:
        # and 연산을 통해 첫 번째(2^0) 비트를 구함.
        prev_bit = n & 1
        while n != 1:
            # 오른쪽 쉬프트 한 n의 첫 번째 비트를 구함
            n = n >> 1
            current_bit = n & 1
            
            # 현재 첫 번째 비트와 이전 첫 번째 비트를 비교. 다른 경우만 1 출력되는 xor 사용
            isDiff = current_bit ^ prev_bit
            if isDiff == 0:
                return False
            
            # 현재 첫 번째 비트를 다음 n의 첫 번째 비트와 비교를 위해 저장
            prev_bit = current_bit
        return True 
    
    # 2의 제곱수 구하는 방식을 이용해 비교
    def soulition3(self, n: int) -> bool:
        # 101010 n
        # 10101  n >> 1
        # 111111 n ^ (n>>1)
        # 111111
        # +    1
        # 1000000
        # &111111
        # 0000000
        n = n ^ (n >> 1)
        return (n & n+1) == 0
