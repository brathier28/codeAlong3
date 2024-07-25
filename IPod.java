package codeAlong3;

public class IPod extends Apple implements Playable{

  public IPod(){}

//  public void playIPod(String songName){
//    System.out.println("Playing " + songName + " from IPod!");
//  }

  @Override
  public void startSong(String songName) {
    System.out.println("Playing " + songName + " from IPod!");
  }
}
