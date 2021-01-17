package com.piwko.exploreit.core.controllers

import com.piwko.exploreit.core.Constants
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Project: exploreit
 *
 * Created on: 16.01.2021
 *
 * Author    : Patryk Piwko
 *
 * Copyright 2021 (C) Si-eCommerce sp. z o.o.
 */

@Controller
@RequestMapping(value = [Constants.HomePage.BASE_URL])
class HomePageController {

    @GetMapping
    fun homePage(model : Model) : String {
        model["pageTitle"] = "Explore It";
        return "homepage";
    }
}