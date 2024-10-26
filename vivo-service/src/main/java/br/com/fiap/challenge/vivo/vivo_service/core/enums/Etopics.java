package br.com.fiap.challenge.vivo.vivo_service.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Etopics {
  START_SAGA("start-saga"),
  FINISH_SUCCESS("finish-success"),
  FINISH_FAIL("finish-fail"),
  PRODUCT_SUCCESS("product-success"),
  PRODUCT_FAIL("product-fail"),
  NOTIFY_ENDING("notify-ending");

  private final String topic;
}
