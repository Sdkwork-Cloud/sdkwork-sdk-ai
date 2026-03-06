from .http_client import HttpClient, SdkConfig
from .api.i18n_resource import I18nResourceApi
from .api.chat import ChatApi
from .api.chat2 import Chat2Api
from .api.videos import VideosApi
from .api.videos2 import Videos2Api
from .api.threads import ThreadsApi
from .api.threads2 import Threads2Api
from .api.responses import ResponsesApi
from .api.responses2 import Responses2Api
from .api.rerank import RerankApi
from .api.rerank2 import Rerank2Api
from .api.music import MusicApi
from .api.music2 import Music2Api
from .api.moderations import ModerationsApi
from .api.moderations2 import Moderations2Api
from .api.chat_completions import ChatCompletionsApi
from .api.chat_completions2 import ChatCompletions2Api
from .api.knowledge_bases import KnowledgeBasesApi
from .api.knowledge_bases2 import KnowledgeBases2Api
from .api.images import ImagesApi
from .api.images2 import Images2Api
from .api.files import FilesApi
from .api.files2 import Files2Api
from .api.embeddings import EmbeddingsApi
from .api.embeddings2 import Embeddings2Api
from .api.context import ContextApi
from .api.context2 import Context2Api
from .api.batches import BatchesApi
from .api.batches2 import Batches2Api
from .api.audio import AudioApi
from .api.audio2 import Audio2Api
from .api.assistants import AssistantsApi
from .api.assistants2 import Assistants2Api
from .api.models import ModelsApi
from .api.models2 import Models2Api


class SdkworkAiClient:
    """sdkwork-ai-sdk SDK Client."""

    def __init__(self, config: SdkConfig):
        self._client = HttpClient(config)
        self.i18n_resource: I18nResourceApi
        self.chat: ChatApi
        self.chat2: Chat2Api
        self.videos: VideosApi
        self.videos2: Videos2Api
        self.threads: ThreadsApi
        self.threads2: Threads2Api
        self.responses: ResponsesApi
        self.responses2: Responses2Api
        self.rerank: RerankApi
        self.rerank2: Rerank2Api
        self.music: MusicApi
        self.music2: Music2Api
        self.moderations: ModerationsApi
        self.moderations2: Moderations2Api
        self.chat_completions: ChatCompletionsApi
        self.chat_completions2: ChatCompletions2Api
        self.knowledge_bases: KnowledgeBasesApi
        self.knowledge_bases2: KnowledgeBases2Api
        self.images: ImagesApi
        self.images2: Images2Api
        self.files: FilesApi
        self.files2: Files2Api
        self.embeddings: EmbeddingsApi
        self.embeddings2: Embeddings2Api
        self.context: ContextApi
        self.context2: Context2Api
        self.batches: BatchesApi
        self.batches2: Batches2Api
        self.audio: AudioApi
        self.audio2: Audio2Api
        self.assistants: AssistantsApi
        self.assistants2: Assistants2Api
        self.models: ModelsApi
        self.models2: Models2Api

        # Initialize API modules
        self.i18n_resource = I18nResourceApi(self._client)
        self.chat = ChatApi(self._client)
        self.chat2 = Chat2Api(self._client)
        self.videos = VideosApi(self._client)
        self.videos2 = Videos2Api(self._client)
        self.threads = ThreadsApi(self._client)
        self.threads2 = Threads2Api(self._client)
        self.responses = ResponsesApi(self._client)
        self.responses2 = Responses2Api(self._client)
        self.rerank = RerankApi(self._client)
        self.rerank2 = Rerank2Api(self._client)
        self.music = MusicApi(self._client)
        self.music2 = Music2Api(self._client)
        self.moderations = ModerationsApi(self._client)
        self.moderations2 = Moderations2Api(self._client)
        self.chat_completions = ChatCompletionsApi(self._client)
        self.chat_completions2 = ChatCompletions2Api(self._client)
        self.knowledge_bases = KnowledgeBasesApi(self._client)
        self.knowledge_bases2 = KnowledgeBases2Api(self._client)
        self.images = ImagesApi(self._client)
        self.images2 = Images2Api(self._client)
        self.files = FilesApi(self._client)
        self.files2 = Files2Api(self._client)
        self.embeddings = EmbeddingsApi(self._client)
        self.embeddings2 = Embeddings2Api(self._client)
        self.context = ContextApi(self._client)
        self.context2 = Context2Api(self._client)
        self.batches = BatchesApi(self._client)
        self.batches2 = Batches2Api(self._client)
        self.audio = AudioApi(self._client)
        self.audio2 = Audio2Api(self._client)
        self.assistants = AssistantsApi(self._client)
        self.assistants2 = Assistants2Api(self._client)
        self.models = ModelsApi(self._client)
        self.models2 = Models2Api(self._client)

    def set_api_key(self, api_key: str) -> 'SdkworkAiClient':
        """Set API key for authentication."""
        self._client.set_api_key(api_key)
        return self

    def set_auth_token(self, token: str) -> 'SdkworkAiClient':
        """Set auth token for authentication."""
        self._client.set_auth_token(token)
        return self

    def set_access_token(self, token: str) -> 'SdkworkAiClient':
        """Set access token for authentication."""
        self._client.set_access_token(token)
        return self

    def set_header(self, key: str, value: str) -> 'SdkworkAiClient':
        """Set custom header."""
        self._client.set_header(key, value)
        return self

    @property
    def http(self) -> HttpClient:
        """Get the underlying HTTP client."""
        return self._client


def create_client(config: SdkConfig) -> SdkworkAiClient:
    """Create a new SDK client instance."""
    return SdkworkAiClient(config)
