@file:JvmName("Camera")
package cleargl.scenegraph

import cleargl.GLVector

open class Camera : Node("Camera") {

    var targeted = false
    var active = false

    protected var target: GLVector = GLVector(0.0f, 0.0f, 0.0f)

    init {
        this.nodeType = "Camera"
    }

}