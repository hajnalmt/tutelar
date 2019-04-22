package com.wanari.tutelar.providers.userpass.basic

import com.wanari.tutelar.core.AuthService.Token
import com.wanari.tutelar.providers.userpass.UserPassService
import com.wanari.tutelar.util.LoggerUtil.LogContext
import spray.json.JsObject

trait BasicProviderService[F[_]] extends UserPassService[F] {
  def register(username: String, password: String, data: Option[JsObject])(implicit ctx: LogContext): F[Token]
}
