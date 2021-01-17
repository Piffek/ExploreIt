package com.piwko.exploreit.configuration

import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource

/**
 * Project: exploreit
 *
 * Created on: 17.01.2021
 *
 * Author    : Patryk Piwko
 *
 * Copyright 2021 (C) Si-eCommerce sp. z o.o.
 */

@Configuration
class ResourceBundleConfiguration {

    @Bean
    fun messageSource(): MessageSource {
        return ReloadableResourceBundleMessageSource().apply {
            setBasename("classpath:messages")
            setDefaultEncoding("UTF-8")
        }
    }
}