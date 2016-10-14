package controllers

import play.api.mvc._
import play.api.libs.json._
import com.gilt.play25.boilerplate.v0.models.json._
import com.gilt.play25.boilerplate.v0.models.{Healthcheck => HealthcheckResponse}

class Healthcheck extends Controller{

  def get() = Action{ implicit request =>
    Ok(Json.toJson(HealthcheckResponse("Play 2.5 boilerplate")))
  }
}
