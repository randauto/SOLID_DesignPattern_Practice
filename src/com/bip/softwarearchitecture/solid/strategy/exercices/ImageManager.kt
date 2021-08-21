package com.bip.softwarearchitecture.solid.strategy.exercices

class ImageManager {
    private lateinit var iScreenRenderer : IScreenRenderer

    public fun setRender(screenRenderer: IScreenRenderer) {
        this.iScreenRenderer = screenRenderer
    }

    public fun show() {
        iScreenRenderer?.let {
            it.showImage()
        }
    }
}