package models

case class malumot(id: Int)

object malumot {
  var wer = Set(
    malumot(1)

  )

  def sort = wer.toList.sortBy(_.id)


}
