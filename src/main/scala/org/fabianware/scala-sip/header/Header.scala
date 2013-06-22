package header
/**
 * Header.scala
 * 
 * RFC 3261 Defined Headers
 * http://tools.ietf.org/html/rfc3261#section-25
 */

trait Header
object Params

trait SipHeader extends Header {
  type name[String]
  type compact[String]
  type params[Params]
}

/**
 * name: name of the header
 * compact: if the header supports a "compact form", this is its compact form
 */

case class Accept(name: String = "Accept") extends SipHeader
case class AcceptEncoding(name: String = "Accept-Encoding") extends SipHeader
case class AcceptLanguage(name: String = "Accept-Language") extends SipHeader
case class AlertInfo(name: String = "Alert-Info") extends SipHeader
case class Allow(name: String = "Allow") extends SipHeader
case class AuthenticationInfo(name: String = "Authentication-Info") extends SipHeader
case class Authorization(name: String = "Authorization") extends SipHeader
case class CallID(name: String = "Call-ID", compact: String = "i") extends SipHeader
case class CallInfo(name: String = "Call-Info") extends SipHeader
case class Contact(name: String = "Contact", compact: String = "m") extends SipHeader
case class ContentDisposition(name: String = "Content-Disposition") extends SipHeader
case class ContentEncoding(name: String = "Content-Encoding", compact: String = "e") extends SipHeader
case class ContentLanguage(name: String = "Content-Language") extends SipHeader
case class ContentLength(name: String = "Content-Length", compact: String = "l") extends SipHeader
case class ContentType(name: String = "Content-Type") extends SipHeader
case class CSeq(name: String = "CSeq") extends SipHeader
case class Date(name: String = "Date") extends SipHeader
case class ErrorInfo(name: String = "Error-Info") extends SipHeader
case class Expires(name: String = "Expires") extends SipHeader
case class From(name: String = "From", compact: String = "f") extends SipHeader
case class InReplyTo(name: String = "In-Reply-To") extends SipHeader
case class MaxForwards(name: String = "Max-Forwards") extends SipHeader
case class MIMEVersion(name: String = "MIME-Version") extends SipHeader
case class MinExpires(name: String = "Min-Expires") extends SipHeader
case class Organization(name: String = "Organization") extends SipHeader
case class Priority(name: String = "Priority") extends SipHeader
case class ProxyAuthenticate(name: String = "Proxy-Authenticate") extends SipHeader
case class ProxyAuthorization(name: String = "Proxy-Authorization") extends SipHeader
case class ProxyRequire(name: String = "Proxy-Require") extends SipHeader
case class RecordRoute(name: String = "Record-Route") extends SipHeader
case class ReplyTo(name: String = "Reply-To") extends SipHeader
case class Require(name: String = "Require") extends SipHeader
case class RetryAfter(name: String = "Retry-After") extends SipHeader
case class Route(name: String = "Route") extends SipHeader
case class Server(name: String = "Server") extends SipHeader
case class Subject(name: String = "Subject", compact: String = "s") extends SipHeader
case class Supported(name: String = "Supported", compact: String = "k") extends SipHeader
case class Timestamp(name: String = "Timestamp") extends SipHeader
case class To(name: String = "To", compact: String = "t") extends SipHeader
case class Unsupported(name: String = "Unsupported") extends SipHeader
case class UserAgent(name: String = "User-Agent") extends SipHeader
case class Via(name: String = "Via", compact: String = "v") extends SipHeader
case class Warning(name: String = "Warning") extends SipHeader
case class WWWAuthenticate(name: String = "WWW-Authenticate") extends SipHeader
case class ExtensionHeader(name: String = "Extension-Header") extends SipHeader