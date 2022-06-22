def Record(self, n: int) -> int:
        # dptotal[i] the number of rewardable records without A whose lenghth is i
        dptotal = [0] *  (n + 1) 
        dp1,dp2,dp3 = 1,1,0
        # dp1: the number of rewardable records that end with one L and without A
        # dp2: the number of rewardable records that end with one P and without A
        # dp3: the number of rewardable records that end with two Ls and without A
        dptotal[0] = 1 # 
        dptotal[1] = dp1 + dp2 + dp3
        mod = 10**9 +7
        for i in range(2,n+1):
            dp1,dp2,dp3 = dp2 % mod,(dp1+dp2+dp3) % mod,dp1 % mod
            dptotal[i] = (dp1 + dp2 + dp3) % mod
        res = 0
        res += dptotal[-1]
        # take A into consideration: 
        # A can take n location
        for i in range(n):
            # i is the location of A
            res += (dptotal[n-i-1] * dptotal[i]) % mod
        return res 
