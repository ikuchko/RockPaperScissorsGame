import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RPSGame {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String playerOneChoice = request.queryParams("PlayerOne");
      String playerTwoChoice = request.queryParams("PlayerTwo");

      boolean gameResult = checkWinner(playerOneChoice, playerTwoChoice);

      model.put("res", gameResult);
      return new ModelAndView(model, layout);

      }, new VelocityTemplateEngine());
  }

  public static Boolean checkWinner(String firstPlayerChoice, String secondPlayerChoice) {
    if ((firstPlayerChoice == "Rock") && (secondPlayerChoice == "Scissors")) {
      return true;
    } else if ((firstPlayerChoice.equals("Scissors")) && (secondPlayerChoice.equals("Rock"))) {
      return false;
    } else if ((firstPlayerChoice.equals("Rock")) && (secondPlayerChoice.equals("Paper"))) {
      return false;
    } else if ((firstPlayerChoice.equals("Paper")) && (secondPlayerChoice.equals("Rock"))) {
      return true;
    } else if ((firstPlayerChoice.equals("Scissors")) && (secondPlayerChoice.equals("Paper"))) {
      return true;
    } else if ((firstPlayerChoice.equals("Paper")) && (secondPlayerChoice.equals("Scissors"))) {
      return false;
    }else {
      return null;
    }
  }
}
