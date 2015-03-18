package controllers


import  models.malumot
import play.api.mvc._

object Malumotlar extends Controller {




  def list = Action {
    Ok(views.html.list(malumot.sort))
  }



}
