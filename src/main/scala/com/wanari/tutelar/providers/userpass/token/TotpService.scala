package com.wanari.tutelar.providers.userpass.token

import com.wanari.tutelar.core.AuthService.Token
import com.wanari.tutelar.providers.userpass.UserPassService
import com.wanari.tutelar.providers.userpass.token.TotpServiceImpl.QRData
import spray.json.JsObject

trait TotpService[F[_]] extends UserPassService[F] {
  def register(userName: String, registerToken: String, password: String, data: Option[JsObject]): F[Token]
  def qrCodeData: F[QRData]
}