package com.intentsoft.zooly.data

import android.graphics.RectF

/**
 * @author Zokirjon
 * @date 10/30/2021
 */
data class DetectionResult(val boundingBox: RectF, val text: String)
