/*
 *  Copyright (c) 2012-2013 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.stram;

import org.apache.hadoop.security.token.TokenIdentifier;
import org.apache.hadoop.security.token.delegation.AbstractDelegationTokenSecretManager;

/**
 *
 * @author Pramod Immaneni <pramod@malhar-inc.com>
 */
public class StramDelegationTokenManager extends AbstractDelegationTokenSecretManager<StramDelegationTokenIdentifier>
{

  public StramDelegationTokenManager(long delegationKeyUpdateInterval, long delegationTokenMaxLifetime, long delegationTokenRenewInterval,
                                                                  long delegationTokenRemoverScanInterval) {
    super(delegationKeyUpdateInterval,delegationTokenMaxLifetime,delegationTokenRenewInterval,delegationTokenRemoverScanInterval);
  }

  public void addIdentifier(StramDelegationTokenIdentifier identifier) {
    createPassword(identifier);
  }

  @Override
  public StramDelegationTokenIdentifier createIdentifier()
  {
    return new StramDelegationTokenIdentifier();
  }

}
