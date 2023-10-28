class Solution {
    public String defangIPaddr(String a) {
        a=a.replace(".","[.]");
        return a;
    }
}