package string;

public class DefanginganIPAddress {
    public static void main(String[] args) {

    }
    public String defangIPaddr(String address) {
        String ans = "";
        ans = address.replace("." , "[.]");
        return ans;
    }
    public String defangIPaddr2(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
