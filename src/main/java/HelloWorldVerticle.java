import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

public class HelloWorldVerticle extends Verticle {

  public void start() {
    container.logger().info("Verticle start.");
    vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
      public void handle(HttpServerRequest req) {
        req.response().headers().set("Content-Type", "text/plain");
        req.response().end("Hello World!!!");
      }
    }).listen(8080);
  }
}
