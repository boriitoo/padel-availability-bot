package nl.xx1.padel.api.messaging.infrastructure.http;

import com.fasterxml.jackson.annotation.JsonProperty;

public record IncomingMessageRequest(
    @JsonProperty("id") String messageId,
    @JsonProperty("body") String body,
    @JsonProperty("from") String from,
    @JsonProperty("isForwarded") Boolean isForwarded) {}
