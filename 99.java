class GfG {
    static string trimLeadingZeros(string s) {
        int firstOne = s.IndexOf('1');
        return (firstOne == -1) ? "0" : s.Substring(firstOne);
    }
    static string addBinary(string s1, string s2) {
   
        s1 = trimLeadingZeros(s1);
        s2 = trimLeadingZeros(s2);
      
        int n = s1.Length;
        int m = s2.Length;

        if (n < m) {
            return addBinary(s2, s1);
        }

        int j = m - 1;
        int carry = 0;
        char[] result = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            int bit1 = s1[i] - '0';
            int sum = bit1 + carry;

            if (j >= 0) {
              
                int bit2 = s2[j] - '0';
                sum += bit2;
                j--;
            }

            int bit = sum % 2;
            carry = sum / 2;
            result[i] = (char)(bit + '0');
        }

        if (carry > 0) {
            return '1' + new string(result);
        }

        return new string(result);
    }

    static void Main() {
        string s1 = "1101";
        string s2 = "111";
        Console.WriteLine(addBinary(s1, s2));
    }
}



function areAnagrams(s1, s2) {
    
    if (s1.length !== s2.length) return false;
    s1 = s1.split('').sort().join('');
    s2 = s2.split('').sort().join('');

    return s1 === s2;
}

const s1 = "geeks";
const s2 = "kseeg";
if(areAnagrams(s1, s2)){
    console.log("true");
}
else{
    console.log("false");
}



function areAnagrams(s1, s2) {
    
    if (s1.length !== s2.length) return false;

    const charCount = {};

    for (let ch of s1) 
        charCount[ch] = (charCount[ch] || 0) + 1;

    for (let ch of s2) 
        charCount[ch] = (charCount[ch] || 0) - 1;
    for (let key in charCount) {
        if (charCount[key] !== 0) {
            return false;
        }
    }
    
    return true;
}
const s1 = "geeks";
const s2 = "kseeg";
if(areAnagrams(s1, s2)){
    console.log("true");
}
else{
    console.log("false");
}
