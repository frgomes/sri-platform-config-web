package sri

package object platform {

  implicit object SriPlatform extends sri.universal.SriPlatform {
    @inline def isIOS: Boolean = false
    @inline def isAndroid: Boolean = false
    @inline def isWeb: Boolean = true
  }

}
