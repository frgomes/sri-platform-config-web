package sri

package object platform {

  implicit object SriPlatForm extends sri.universal.SriPlatForm {
    @inline def isIOS: Boolean = false
    @inline def isAndroid: Boolean = false
    @inline def isWeb: Boolean = true
  }

}
