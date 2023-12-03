package com.kryptonn.jba.model.base;

import jakarta.annotation.Nullable;

public record Links(Link self, @Nullable Link user, @Nullable Link profile) {
  public Links(Link self) {
    this(self, null, null);
  }

  public Links(Link self, @Nullable Link user) {
    this(self, user, null);
  }

  public Links(Link self, @Nullable Link user, @Nullable Link profile) {
    this.self = self;
    this.user = user;
    this.profile = profile;
  }
}