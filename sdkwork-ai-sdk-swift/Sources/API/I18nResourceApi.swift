import Foundation

public class I18nResourceApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    public func getOptions(params: [String: Any]? = nil) async throws -> PlusApiResultListLabelOption? {
        let response = try await client.get(ApiPaths.aiPath("/v1/open/i18n/options"), params: params)
        return response as? PlusApiResultListLabelOption
    }

    public func createOptions(params: [String: Any]? = nil) async throws -> PlusApiResultListLabelOption? {
        let response = try await client.post(ApiPaths.aiPath("/v1/open/i18n/options"), body: nil, params: params)
        return response as? PlusApiResultListLabelOption
    }
}
