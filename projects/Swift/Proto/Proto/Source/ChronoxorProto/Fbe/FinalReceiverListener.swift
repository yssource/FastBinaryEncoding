// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

import ChronoxorFbe

// Fast Binary Encoding Proto final receiver listener
public protocol FinalReceiverListener: ChronoxorFbe.ReceiveLogListener {
    func onReceive(value: ChronoxorProto.OrderMessage)
    func onReceive(value: ChronoxorProto.BalanceMessage)
    func onReceive(value: ChronoxorProto.AccountMessage)
}

public extension FinalReceiverListener {
    func onReceive(value: ChronoxorProto.OrderMessage) {}
    func onReceive(value: ChronoxorProto.BalanceMessage) {}
    func onReceive(value: ChronoxorProto.AccountMessage) {}
}