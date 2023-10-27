package qa.guru.helpers;

import org.aeonbits.owner.ConfigFactory;
import qa.guru.config.RemoteConfig;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {

    static RemoteConfig config = ConfigFactory.create(RemoteConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {

        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);
        return given()
                .auth().basic(config.getUser(), config.getKey())
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}