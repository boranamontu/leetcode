class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i=players.length-1;
        int j=trainers.length-1;
        int matchcount=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i!=-1 && j!=-1){
            if(players[i]<=trainers[j]){
                    matchcount++;
                    j--;
            }
            i--;
        }
        return matchcount;

    }
}