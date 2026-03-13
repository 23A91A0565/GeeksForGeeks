class Solution {
public:
    vector<string> generateIp(string &s) {
        vector<string> ans;
        string curr="";
        cal(s,ans,0,0,0,curr);
        return ans;
    }

    void cal(string &s, vector<string> &ans, int parts, int index, int len, string &cur_s){

        if(index==s.size() && parts==4){
            cur_s.pop_back();
            ans.push_back(cur_s);
            cur_s.push_back('.');
            return;
        }

        if(index>=s.size() || len>3 || parts==4) return;

        if(s[index]=='0' && len>0) return;

        int val = stoi(s.substr(index, len+1));

        if(val<=255){
            string temp = cur_s + s.substr(index,len+1) + ".";
            cal(s, ans, parts+1, index+len+1, 0, temp);
        }

        cal(s, ans, parts, index, len+1, cur_s);
    }
};