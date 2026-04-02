package org.example.exercise4

import com.google.zxing.BarcodeFormat
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter
import java.nio.file.FileSystems
import java.nio.file.Path

fun saveQRCode(content: String, fileName: String) {
    val width = 300
    val height = 300

    val bitMatrix = QRCodeWriter().encode(
        content,
        BarcodeFormat.QR_CODE,
        width,
        height
    )

    val path: Path = FileSystems.getDefault().getPath(fileName)
    MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path)
}
