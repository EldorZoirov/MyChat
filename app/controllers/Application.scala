package controllers

import controllers.Malumotlar._
import models.malumot
import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("I'm new site!!!"))
  }
  def registr = Action {
    Ok(views.html.registr("Eldor"))
  }
  def enter = Action {
    Ok(views.html.enter("Eldorbek"))
  }
}