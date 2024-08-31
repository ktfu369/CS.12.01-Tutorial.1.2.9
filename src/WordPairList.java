import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;


    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        // To be implemented.
        for(int i = 0;i<words.length - 1;i++){
            for(int j = i+1 ;j<words.length;j++){
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }

    }

    public int numMatches()
    {
        for(WordPair hi : allPairs) {
        System.out.print(hi.getFirst() + " " + hi.getSecond() +"   ");
    }
        int cnt = 0;
        // To be implemented.
        for(int i = 0;i<allPairs.size() - 1;i++){
            for(int j=i+1;j<allPairs.size();j++){
                if(allPairs.get(i).getFirst() == allPairs.get(j).getFirst() && allPairs.get(i).getSecond() == allPairs.get(j).getSecond()){
                    cnt++;
                    allPairs.remove(i);
                }
            }
        }
        return cnt;
    }

    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }
}
