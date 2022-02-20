class Solution:
    def reverseBits(self, n: int) -> int:
        MSBmask = pow(2, 31)
        LSBmask = 1
        while MSBmask > LSBmask:
            MSB = n & MSBmask
            LSB = n & LSBmask
            if MSB / MSBmask != LSB / LSBmask:
                n ^= MSBmask | LSBmask
            MSBmask >>= 1
            LSBmask <<= 1
        return n