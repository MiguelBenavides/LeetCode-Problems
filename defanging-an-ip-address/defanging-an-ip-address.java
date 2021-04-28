class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ip = new StringBuilder();
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) != '.'){
                ip.append(address.charAt(i));
            } else {
                ip.append("[.]");
            }
        }
        return ip.toString();
    }
}