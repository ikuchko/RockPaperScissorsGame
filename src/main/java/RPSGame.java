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
    } else {
      return null;
    }
  }
}
