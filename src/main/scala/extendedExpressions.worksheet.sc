import cats.effect.unsafe.implicits.global
import doodle.core.*
import doodle.image.*
import doodle.syntax.all.*
import doodle.image.syntax.all.*
import doodle.java2d.*
//
// import doodle.image.syntax.core.*
// import scala.concurrent.duration.*
// import doodle.reactor.*

// create
Image.circle(100)

// call
// Image.circle(100).draw()

// Image.rectangle(100, 50).draw()
// Image.triangle(120, 80).draw()

// My art
val pic = Image
  // .fillColor(Color.red)
  .circle(20)
  .fillColor(Color.orange)
  .below(
    Image
      .circle(10)
      .fillColor(Color.white)
      .on(Image.circle(30).fillColor(Color.black))
      .beside(
        Image
          .circle(10)
          .fillColor(Color.white)
          .on(Image.circle(30).fillColor(Color.black))
      )
  )
  .on(Image.circle(150).fillColor(Color.aliceBlue))
  .above(
    Image
      .circle(80)
      .beside(Image.circle(220))
      .beside(Image.circle(80))
      .fillColor(Color.aliceBlue)
  )
  .above(Image.circle(300).fillColor(Color.aliceBlue))
  .below(Image.rectangle(100, 150).fillColor(Color.darkBlue))
// .fillColor(Color.darkBlue)

pic.draw()
