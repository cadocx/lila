package lila.socket
package actorApi

import play.api.libs.json.JsObject

case class Connected[M <: SocketMember](
  enumerator: JsEnumerator,
  member: M
)
case class Sync(uid: String, friends: List[String])
case class Ping(uid: String, version: Option[Int], lagTenths: Option[Int])
case object Broom
case class Quit(uid: String)

case class SocketEnter[M <: SocketMember](uid: String, member: M)
case class SocketLeave[M <: SocketMember](uid: String, member: M)

case class Resync(uid: String)

case object GetVersion

case class SendToFlag(flag: String, message: JsObject)

case object PopulationTell
case class NbMembers(nb: Int)

case class StartWatching(uid: String, member: SocketMember, gameIds: Set[String])
