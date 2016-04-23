/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 by luxe - https://github.com/de-luxe - BURST-LUXE-RED2-G6JW-H4HG5
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package burstcoin.faucet.network.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class SendMoneyResponse
{
  private String signatureHash;
  private String unsignedTransactionBytes;

  @JsonIgnore
  private Object transactionJSON;

  private boolean broadcasted;
  private int requestProcessingTime;
  private String transactionBytes;
  private String fullHash;
  private String transaction;

  public String getSignatureHash()
  {
    return signatureHash;
  }

  public String getUnsignedTransactionBytes()
  {
    return unsignedTransactionBytes;
  }

  public Object getTransactionJSON()
  {
    return transactionJSON;
  }

  public boolean isBroadcasted()
  {
    return broadcasted;
  }

  public int getRequestProcessingTime()
  {
    return requestProcessingTime;
  }

  public String getTransactionBytes()
  {
    return transactionBytes;
  }

  public String getFullHash()
  {
    return fullHash;
  }

  public String getTransaction()
  {
    return transaction;
  }
}