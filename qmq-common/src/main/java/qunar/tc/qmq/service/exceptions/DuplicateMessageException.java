/*
 * Copyright 2018 Qunar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.com.qunar.pay.trade.api.card.service.usercard.UserCardQueryFacade
 */

package qunar.tc.qmq.service.exceptions;

/**
 * User: zhaohuiyu
 * Date: 12/25/12
 * Time: 12:30 PM
 */
public class DuplicateMessageException extends MessageException {

    private static final long serialVersionUID = 8267606930373695631L;

    public DuplicateMessageException(String messageId) {
        super(messageId, "Duplicated message");
    }
}
