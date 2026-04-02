import java.io.ByteArrayOutputStream
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import com.google.zxing.client.j2se.MatrixToImageWriter

fun generateQRCodeStream(content: String): ByteArrayOutputStream {
    val width = 300
    val height = 300

    val bitMatrix = QRCodeWriter().encode(
        content,
        BarcodeFormat.QR_CODE,
        width,
        height
    )

    val outputStream = ByteArrayOutputStream()
    MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream)

    return outputStream
}