import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RPSGame {
  public static void main(String[] args) {}

  public static Boolean checkWinner(String firstPlayerChoice, String secondPlayerChoice) {
    if ((firstPlayerChoice == "Rock") && (secondPlayerChoice == "Scissors")) {
      return true;
    } else if ((firstPlayerChoice == "Scissors") && (secondPlayerChoice == "Rock")) {
      return false;
    } else if ((firstPlayerChoice == "Rock") && (secondPlayerChoice == "Paper")) {
      return false;
    } else if ((firstPlayerChoice =="Paper") && (secondPlayerChoice == "Rock")) {
      return true;
    } else if ((firstPlayerChoice == "Scissors") && (secondPlayerChoice == "Paper")) {
      return true;
    } else if ((firstPlayerChoice == "Paper") && (secondPlayerChoice == "Scissors")) {
      return false;
    }else {
      return null;
    }
  }
}
