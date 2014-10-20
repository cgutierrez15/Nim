// Christian Gutierrez
// October 17th, 2014 AP-Computer Science 
public class RandomNim{
  int start; 
  int lastmove; 
  public RandomNim(int startnum){ //Constructor
    start = startnum; 
    lastmove = startnum; 
  }
  public int play(int pieces){ //Play method, it will return a value 
    int humanplay = lastmove - pieces; // figures out what number human played by difference math
    if (humanplay == 2){ //if the human guesses 2, then the computer will guess 1
      lastmove = pieces -1; // this sets the pieces left to reflect the number after the computer guesses
      return 1;
    }
    else { //if human guesses 1, the computer will guess 2
      lastmove = pieces -2; // this sets the pieces left to reflect the number after the computer guesses
      return 2; 
    }
  }
}